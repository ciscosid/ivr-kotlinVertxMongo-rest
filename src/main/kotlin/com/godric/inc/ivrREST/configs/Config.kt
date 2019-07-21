package com.godric.inc.ivrREST.configs

import io.vertx.core.json.JsonObject

object Config {
        private var config: JsonObject = JsonObject().put(
        "connection_string",
        "mongodb+srv://Godric:dolfyn95**@ivr-db-n5wlx.mongodb.net/test?retryWrites=true&w=majority"
    )

    fun getConfig(): JsonObject {
        return config
    }
}


//fun main() {
////    Config.config = JsonObject().put("na", "na")
//    println(Config.getConfig())
//}
