package pers.cyz.bigdatatool.node.common.utils

import java.io.File

object fileUtils {
  def createFile(fileName: File): Unit = {
    if (!fileName.getParentFile.exists()) {
      fileName.getParentFile.mkdirs()
    }
    fileName.createNewFile()
  }

}
