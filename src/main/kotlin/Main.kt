import factorymethod.IDBAdapter
import factorymethod.MySqlDBAdapter
import factorymethod.OracleDBAdapter
import factorymethod.PostgreSqlDBAdapter
import properties.PropertiesUtil
import java.sql.*
import java.util.*

fun main(){
    //val property: Properties? = PropertiesUtil
     //   .loadProperty("properties/DBMySQL")
  //  println(property)

    val mySql: IDBAdapter = MySqlDBAdapter()
    println(mySql.getConnection().toString())

    val oracle: IDBAdapter= OracleDBAdapter()
    println(oracle.getConnection().toString())

    val postgres: IDBAdapter= PostgreSqlDBAdapter()
    println(postgres.getConnection().toString())
}