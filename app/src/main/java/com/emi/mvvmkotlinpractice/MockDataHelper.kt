package com.emi.mvvmkotlinpractice

import java.util.*
import kotlin.collections.ArrayList

class MockDataHelper {



    companion object {
        val loadingData: List<Articles>
            get() {
                val list = ArrayList<Articles>()
                for (i in 0..25) {
                    val article = Articles("Coding From The Dome!", "Codeanando Desde la Cabeza",
                        "Its extremely important to code from your mind because it teaches you" + " " +
                            "how to think and build systems that are sound and solid over time.", Date())
                      list.add(article)

                }
                return list
            }
    }


}