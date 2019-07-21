package com.godric.inc.ivrREST.controllers

import com.godric.inc.ivrREST.utils.MongoUtil
import io.vertx.core.json.Json
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.RoutingContext

class Requests {
    companion object {
        fun getOneUser(routingContext: RoutingContext, collectionName: String) {
            val json = JsonObject()
            val requestData = routingContext.bodyAsJson
            MongoUtil.getClient().findOne(collectionName, requestData, json) { result ->
                if (result.succeeded()) {
                    println("vim")
                    val user = result.result()
                    val response = routingContext.response()
                    response
                        .putHeader("content-type", "application/json")
                        .end(Json.encode(user))
                } else {
                    println("Nope")
                }
            }
        }

        fun index(routingContext: RoutingContext) {
            val resJson = JsonObject()
            resJson
                .put("msg", "Welcome to the Kotlin version of the IVR REST API")
                .put("ok", true)

            val response = routingContext.response()
            response
                .putHeader("content-type", "application/json")
                .end(resJson.encodePrettily())
        }
    }
}
