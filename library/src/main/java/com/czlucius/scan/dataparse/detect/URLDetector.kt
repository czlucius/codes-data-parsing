package com.czlucius.scan.dataparse.detect

import android.util.Patterns
import com.czlucius.scan.dataparse.Detector
import com.czlucius.scan.dataparse.data.Data
import com.czlucius.scan.dataparse.data.URL

class URLDetector: Detector() {
    override fun getData(raw: String): Data? {
        return if (Patterns.WEB_URL.matcher(raw).matches()) { URL(raw) }
            else { null }
    }
}