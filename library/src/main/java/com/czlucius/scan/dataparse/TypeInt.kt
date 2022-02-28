package com.czlucius.scan.dataparse

import androidx.annotation.IntDef
import com.czlucius.scan.dataparse.TypeInts.TYPE_CONTACT
import com.czlucius.scan.dataparse.TypeInts.TYPE_EMAIL
import com.czlucius.scan.dataparse.TypeInts.TYPE_GEOLOCATION
import com.czlucius.scan.dataparse.TypeInts.TYPE_PHONE
import com.czlucius.scan.dataparse.TypeInts.TYPE_SMS
import com.czlucius.scan.dataparse.TypeInts.TYPE_UNKNOWN_OR_TEXT
import com.czlucius.scan.dataparse.TypeInts.TYPE_URL
import com.czlucius.scan.dataparse.TypeInts.TYPE_WIFI


@Target(AnnotationTarget.TYPE)
@IntDef(
    TYPE_EMAIL,
    TYPE_URL,
    TYPE_CONTACT,
    TYPE_WIFI,
    TYPE_SMS,
    TYPE_PHONE,
    TYPE_GEOLOCATION,
    TYPE_UNKNOWN_OR_TEXT
)
annotation class TypeInt

object TypeInts {
    const val TYPE_EMAIL = 1
    const val TYPE_URL = 2
    const val TYPE_CONTACT = 3
    const val TYPE_WIFI = 4
    const val TYPE_SMS = 5
    const val TYPE_PHONE = 6
    const val TYPE_GEOLOCATION = 7
    const val TYPE_UNKNOWN_OR_TEXT = 0
}