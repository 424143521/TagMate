# 前言
吾日三省吾身。所以统计自己做得不好的和做得好的事情及其频率很正常是吧。
# 正文
当前APP名称就叫“无咎”
## 功能
无论是好的方面还是不好的方面，都允许添加自定义类型。添加备注。<br>
主要是统计时间段，比如2022年9月23日 09:01:04，则会统计到9点。
### 好的方面(无咎)
### 不好的方面 (咎)

## module 设计
### app
壳app,负责决定要使用的导入的功能。
### common
从逻辑上认为这个调调是底层基础库，提供外部能力的module 都依赖于这个调调提供 服务。
### externalLib
这个调调，个人认为有点问题。当初想着的是简单的外部maven的使用都在这里提供能力及其初始化。但是好像和组件化的逻辑冲突了。
但是一个外部 maven 创建一个module 又感觉怪怪的
### hotUpdate
 热更新，热修复。动态加载class
### layered
界面分层，提供骨架屏等相关能力。
### localData
本地的数据存储方案
### skinPeeler
换肤方案
### webview
webview 的扩展类
### netWork
网络请求，想的是，网络请求也单独提出来，外部只有传入参数和获取参数的权利。
而且通过内部逻辑处理调用localData
### notice
全局性通知和aidl,通道我觉得 common 提供了代理，可以写在webview 获取其他module中。不需要再创建一个module了。
### baseUI
baseUI 的相关module,提供baseFragment,activity，常用的dialog，view等等。
因为有些情况下的module 是没有UI相关的，所以把他和common 区分开

## 项目目录
我们期望项目目录和module 存放于不同的目录下。比如 基础库就放到基础库的module中。


## 技术方面选型
### android
android x
### 设计模式
 MVVM
### 数据库
sqlite room
### 首页导航
nativegation
### 设置

### 路由跳转
[Drouter](https://github.com/didi/DRouter)
### 界面分层
LoadSir
### 骨架屏
### 刷新
### adapter
###

## 更新
