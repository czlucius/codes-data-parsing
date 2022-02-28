package com.czlucius.scan.dataparse.data

import com.czlucius.scan.dataparse.TypeInts

data class Text(val raw: String): Data(TypeInts.TYPE_UNKNOWN_OR_TEXT, raw) {

}