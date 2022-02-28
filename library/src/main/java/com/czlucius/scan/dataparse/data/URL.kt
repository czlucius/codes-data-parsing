package com.czlucius.scan.dataparse.data

import android.net.Uri
import com.czlucius.scan.dataparse.TypeInt
import com.czlucius.scan.dataparse.TypeInts
import java.net.URL

data class URL(
    val raw: String
    ): Data(TypeInts.TYPE_URL, raw) {
        val url: String = raw.run {
            var uri = Uri.parse(this)
            if (uri.scheme == null) {
                val builder = uri.buildUpon()
                builder.scheme("http")
                uri = builder.build()
            }
            uri.toString()
        }
    }