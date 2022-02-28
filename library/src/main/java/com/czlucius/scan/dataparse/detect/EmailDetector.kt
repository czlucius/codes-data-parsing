package com.czlucius.scan.dataparse.detect

import android.net.MailTo
import android.net.ParseException
import android.util.Patterns
import com.czlucius.scan.dataparse.Detector
import com.czlucius.scan.dataparse.data.Data
import com.czlucius.scan.dataparse.data.Email
import com.czlucius.scan.dataparse.data.URL

class EmailDetector: Detector() {
    override fun getData(raw: String): Data? {
        if (Patterns.EMAIL_ADDRESS.matcher(raw).matches()) { return Email(raw) }
        return try {
            MailTo.parse(raw)
            Email(raw)
        } catch (e: ParseException) {
            null
        }
    }
}