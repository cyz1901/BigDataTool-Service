
import pers.cyz.bigdatatool.node.common.config.{AppConfig, SystemConfig}
import pers.cyz.bigdatatool.node.common.utils.loader.Loader
import pers.cyz.bigdatatool.node.common.utils.loader.LoaderType.Yaml
import pers.cyz.bigdatatool.node.core.distributed.FlowerNode

object flowerNodeTest {
  def main(args: Array[String]): Unit = {
    // 获取配置
    val loader = new Loader[AppConfig.type]().Builder
      .setLoaderType(Yaml)
      .setConfigFilePath("node/src/main/resource/etc/node.yml").build()
    loader.fileToObjMapping()
    val node = new FlowerNode()
    node.run()
//    println(UrlUtils.getUrl("hadoop","123456"))
//    println(SystemConfig.compressedFormat)
//    println(SystemConfig.localHostIp)
//    println(SystemConfig.localHostName)
  }
}