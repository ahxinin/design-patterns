## 设计模式 

### 面向对象
#### 贫血模型
传统对象模型，只拥有属性。代码实现：ddd -> anemic
#### 充血模型
具备顺序及业务逻辑。代码实现：ddd -> congestion
***
### 策略模式
#### 实现1：简单工厂实现
新增策略需要实现策略接口 Strategy，并在工厂类中初始化时增加新的策略类。
代码实现：strategy -> simple
#### 实现2：spring自动装配注入Map
新增策略需要实现策略接口 ItemQueryService，标注服务名称。
代码实现：strategy -> annotation
#### 实现3：spring织入
新增策略需要实现策略接口 ShopRankHandler
代码实现：strategy -> spring