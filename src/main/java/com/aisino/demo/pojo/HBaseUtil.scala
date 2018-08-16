package com.aisino.demo.pojo

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.hbase.client.{Get, HTable, Put}
import org.apache.hadoop.hbase.protobuf.generated.HBaseProtos.TableName

object HBaseUtil {
  val conf = init()

  def init(): Configuration = {
    ???
  }

  def query(rowkey: String, family: String, col: String, tableName: String) = {
    val table = new HTable(conf, tableName)
    val get = new Get(rowkey.getBytes())
    val res = table.get(get)
    val bytes = res.getValue(family.getBytes(), col.getBytes())
    new String(bytes)
  }

  def update(put: Put, tableName: String) = {
    val table = new HTable(conf, tableName)
    table.put(put)
  }

  def getPut(rowkey: String, family: String, cols: List[String], vals: List[String]) = {
    val put = new Put(rowkey.getBytes())
    for((col,value) <- cols.zip(vals)){
      put.addColumn(family.getBytes(), col.getBytes(), value.getBytes())
    }
    put
  }
}
