
## FreelineButterKnife

Test for [free#392 增量编译不支持 ButterKnife 8.4.0](https://github.com/alibaba/freeline/issues/392)

### 测试方法:

1. freeline 全量编译, 运行
1. 取消注释 `onClick` 方法, 编译, freeline 增量编译运行, 点击fab看结果
1. 再注释掉 `onClick` 方法, 编译, freeline 增量编译运行, 再点击fab看结果
1. 重复１和２继续测试


### 已知问题：

1. 1-->2过程中, 出现异常:

```
com.cn.freelinebutterknife A/art: art/runtime/interpreter/interpreter_common.h:146] Check failed: self->IsExceptionPending()
com.cn.freelinebutterknife A/libc: Fatal signal 6 (SIGABRT), code -6 in tid 20669 (linebutterknife)
```