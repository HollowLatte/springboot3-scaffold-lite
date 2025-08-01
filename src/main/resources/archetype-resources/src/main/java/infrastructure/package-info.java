#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 基础设施层。负责所有技术细节的实现。比如，它会实现 domain 层定义的 Gateway 接口，通过 MyBatis、RPC 客户端等具体技术与数据库或外部服务交互。
 * */
package ${package}.domain;