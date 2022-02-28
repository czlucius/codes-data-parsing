package com.czlucius.scan.dataparse.data

import android.net.MailTo
import android.net.ParseException
import com.czlucius.scan.dataparse.TypeInts
class Email(raw: String): Data(TypeInts.TYPE_EMAIL, raw) {
    /**
     * @throws ParseException Throws ParseException when input is not an email address nor a mailto URL.
     */
    private val mailTo: MailTo = try { android.net.MailTo.parse(raw) }
    catch (e: ParseException) { MailTo.parse("mailto:$raw") }

    val to: List<String> = mailTo.to?.split(", ") ?: emptyList()
    val cc: List<String> = mailTo.cc?.split(", ") ?: emptyList()
    val body: String = mailTo.body ?: ""
    val subject: String = mailTo.subject ?: ""
    val headers: Map<String, String> = mailTo.headers ?: emptyMap()

}