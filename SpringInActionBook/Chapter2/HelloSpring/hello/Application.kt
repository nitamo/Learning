package hello

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

fun main(args: Array<String>) {
    val ctx = ClassPathXmlApplicationContext("META-INF/spring/app-context.xml")
    val mrCls = MessageRenderer::class.java
    val mr : MessageRenderer = ctx.getBean("renderer", mrCls) as MessageRenderer
    mr.render()
}