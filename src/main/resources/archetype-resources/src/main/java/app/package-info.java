#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 应用层。负责业务流程的编排和调度。它接收来自适配层的 Command/Query，调用领域服务完成核心业务逻辑，然后返回结果。这一层非常薄，不包含任何业务规则。
 * */
package ${package}.app;