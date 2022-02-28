package com.czlucius.scan.dataparse.detect

import com.czlucius.scan.dataparse.Detector
import com.czlucius.scan.dataparse.data.ContactVCF
import com.czlucius.scan.dataparse.data.Data
import ezvcard.Ezvcard

class VCardDetector: Detector() {
    override fun getData(raw: String): Data? {
        return if (Ezvcard.parse(raw).all().isNullOrEmpty()){
            ContactVCF(raw)
        } else { null }
    }
}