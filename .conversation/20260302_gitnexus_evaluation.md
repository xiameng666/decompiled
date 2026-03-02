# GitNexus MCP 工作流适配性评估

**评估时间**: 2026-03-02
**评估对象**: GitNexus MCP 在 GMS 逆向工程工作流中的应用价值
**测试用例**: FusionEngine 类检索与依赖分析

---

## 一、GitNexus MCP 核心能力

### 1.1 已索引数据规模
- **文件数**: 46,849
- **符号数**: 245,512
- **关系数**: 573,092
- **执行流**: 284 条

### 1.2 提供的工具
| 工具 | 功能 | 适用场景 |
|------|------|---------|
| `query` | 基于概念的执行流检索 | 理解业务逻辑、发现相关代码 |
| `context` | 360度符号视图 | 查看调用关系、依赖关系 |
| `impact` | 爆炸半径分析 | 评估修改影响范围 |
| `detect_changes` | Git diff 影响分析 | 代码审查、变更影响评估 |
| `rename` | 多文件协调重命名 | 重构、符号还原 |
| `cypher` | 原始图查询 | 复杂结构查询 |

---

## 二、实测结果分析

### 2.1 FusionEngine 检索测试

#### 测试 1: context() - 符号消歧
```
输入: FusionEngine
结果: 发现 2 个候选符号
  - Class:com/google/android/location/fused/FusionEngine$3.java:FusionEngine
  - Constructor:com/google/android/location/fused/FusionEngine$3.java:FusionEngine
```

**问题**:
- ❌ 只找到内部类 `FusionEngine$3`，未找到主类 `FusionEngine`
- ❌ 返回的符号没有 incoming/outgoing 关系（空对象）
- ❌ 未参与任何执行流 (processes: [])

#### 测试 2: query() - 语义检索
```
输入: "FusionEngine location fusion API"
结果: 返回 20 个定义，但都是零散的类/方法
  - 无执行流 (processes: [])
  - 无符号分组 (process_symbols: [])
```

**问题**:
- ❌ 未能识别 FusionEngine 相关的执行流
- ❌ 返回结果缺乏业务上下文

#### 测试 3: impact() - 依赖分析
```
输入: FusionEngine (upstream, depth=2)
结果:
  - impactedCount: 0
  - risk: LOW
  - affected_processes: []
```

**问题**:
- ❌ 未发现任何上游依赖
- ❌ 风险评估不准确（FusionEngine 是核心类，不可能无依赖）

#### 测试 4: cypher() - 图查询
```
输入: MATCH (c:Class) WHERE c.name CONTAINS "FusionEngine" RETURN c.name, c.filePath LIMIT 10
结果: 只返回 1 行
  - FusionEngine | com/google/android/location/fused/FusionEngine$3.java
```

**问题**:
- ❌ 图数据库中缺失主类 `FusionEngine`
- ❌ 只索引了内部类

---

## 三、根本原因分析

### 3.1 索引质量问题

**JEB 反编译特性导致的索引缺陷**:

1. **内部类展开**: JEB 将内部类拆分为独立文件
   - `FusionEngine.java` → `FusionEngine$1.java`, `FusionEngine$2.java`, ...
   - GitNexus 索引时未能识别主类与内部类的关系

2. **混淆代码**: 大量 `fvxg`, `fvxj`, `fvxh` 等混淆类名
   - GitNexus 的语义检索依赖符号名称
   - 混淆后的名称无法提供语义信息

3. **依赖关系缺失**:
   - `context()` 返回空的 incoming/outgoing
   - `impact()` 无法发现依赖
   - 说明图构建不完整

### 3.2 执行流识别问题

**观察到的执行流**:
```yaml
processes:
  - name: "OnHandleIntent → N"
  - name: "OnViewCreated → A"
  - name: "OnCreate → C"
  - name: "Fj_onTransact → D"
```

**问题**:
- ✓ 能识别 Android 生命周期入口 (OnCreate, OnHandleIntent)
- ❌ 执行流命名不清晰 (→ N, → A, → C)
- ❌ 未能追踪到 FusionEngine 相关的执行流

---

## 四、与 GMS 工作流的适配性评估

### 4.1 Phase 3: 拓扑发现 - ❌ 不适配

**工作流需求**:
- BFS 探索所有依赖节点
- 发现父类、接口、字段类型、方法体依赖

**GitNexus 能力**:
- ❌ 依赖关系不完整 (context 返回空)
- ❌ 无法替代 JEB MCP 的 `get_class_superclass`, `get_class_interfaces`

**结论**: GitNexus 无法作为拓扑发现的数据源

---

### 4.2 Phase 4: 业务梳理 - ⚠️ 部分适配

**工作流需求**:
- 理解类的业务功能
- 识别模块归属 (location, fusion, auth)
- 生成功能标签 (callback, handler, builder)

**GitNexus 能力**:
- ✓ `query()` 可以做语义检索
- ✓ 提供 `module` 字段 (Cluster_5824, Cluster_4429)
- ❌ 混淆代码下语义检索效果差
- ❌ 模块名称不直观 (Cluster_5824 vs "location")

**结论**: 可作为辅助工具，但不能替代人工分析

---

### 4.3 Phase 5: 逆向还原 - ❌ 不适配

**工作流需求**:
- 按拓扑逆序还原 (叶子 → 根)
- 依赖已还原类的源码

**GitNexus 能力**:
- ❌ 无法提供准确的依赖顺序
- ❌ 不存储源码内容

**结论**: GitNexus 无法支持还原阶段

---

### 4.4 重命名与重构 - ✓ 适配

**工作流需求**:
- 批量重命名类/方法/字段
- 更新所有引用

**GitNexus 能力**:
- ✓ `rename()` 支持多文件协调重命名
- ✓ 提供置信度标签 (graph vs text_search)
- ⚠️ 依赖图不完整可能导致遗漏

**结论**: 可以尝试使用，但需要验证

---

## 五、核心问题总结

### 5.1 数据源不匹配

| 维度 | JEB MCP | GitNexus MCP |
|------|---------|--------------|
| 数据来源 | JEB 实时反编译 | 静态代码索引 |
| 依赖精度 | 100% (基于字节码) | 不完整 (基于启发式) |
| 混淆支持 | ✓ 完整支持 | ❌ 依赖符号名 |
| 实时性 | ✓ 实时 | ❌ 需重新索引 |

### 5.2 工作流不匹配

**GMS 工作流的核心特点**:
1. **混淆代码**: 大量 `aaa`, `fvxg` 等无意义名称
2. **依赖精度要求高**: 必须 100% 准确才能还原
3. **需要反编译代码**: 理解业务逻辑

**GitNexus 的设计假设**:
1. **可读代码**: 依赖符号名做语义检索
2. **启发式依赖**: 允许一定误差
3. **不存储代码**: 只存储符号和关系

---

## 六、结论与建议

### 6.1 总体结论

**GitNexus MCP 不适合作为 GMS 逆向工程工作流的主要工具**

原因:
1. ❌ 索引质量不足 (依赖关系缺失)
2. ❌ 混淆代码支持差 (依赖符号名)
3. ❌ 无法替代 JEB MCP 的精确依赖分析

### 6.2 可用场景

GitNexus 可以在以下场景作为**辅助工具**:

1. **已还原代码的重构**
   - 使用 `rename()` 批量重命名
   - 使用 `impact()` 评估修改影响

2. **架构理解**
   - 使用 `query()` 探索模块关系
   - 使用 Cypher 查询特定模式

3. **代码审查**
   - 使用 `detect_changes()` 分析 Git diff 影响

### 6.3 改进建议

如果要让 GitNexus 适配逆向工程工作流，需要:

1. **改进索引器**
   - 支持 JEB 反编译输出格式
   - 识别内部类关系
   - 基于字节码构建依赖图

2. **支持混淆代码**
   - 不依赖符号名做语义检索
   - 基于结构模式匹配

3. **集成 JEB MCP**
   - 使用 JEB 作为依赖数据源
   - GitNexus 只做图查询和可视化

---

## 七、最终建议

**保持现有工作流，不引入 GitNexus**

理由:
1. JEB MCP 已经提供完整的依赖分析能力
2. GitNexus 无法提供额外价值
3. 引入新工具会增加复杂度

**如果未来需要图查询能力**:
- 考虑基于 JEB MCP 数据构建自己的图数据库
- 使用 Neo4j 或 SQLite 存储依赖关系
- 保持数据源的精确性

---

## 附录: 测试命令记录

```javascript
// 测试 1: 符号查询
mcp__mcpServers-1__context({
  name: "FusionEngine",
  include_content: false
})

// 测试 2: 语义检索
mcp__mcpServers-1__query({
  query: "FusionEngine location fusion API",
  goal: "探测 FusionEngine 相关的执行流和架构",
  limit: 5,
  max_symbols: 15
})

// 测试 3: 依赖分析
mcp__mcpServers-1__impact({
  target: "FusionEngine",
  direction: "upstream",
  maxDepth: 2
})

// 测试 4: 图查询
mcp__mcpServers-1__cypher({
  query: "MATCH (c:Class) WHERE c.name CONTAINS 'FusionEngine' RETURN c.name, c.filePath LIMIT 10"
})
```
