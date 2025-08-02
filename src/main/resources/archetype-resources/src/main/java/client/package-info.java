#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 * 客户端层。它定义了系统对外暴露的所有服务接口 (api) 和数据传输对象 (dto)。任何外部调用者都只应该依赖这个 client 模块，实现了对内部实现细节的完美屏蔽。
 * 单模块工程无需用到该层，单模块中该层的职责由adapter层承担
 */
package ${package}.client;