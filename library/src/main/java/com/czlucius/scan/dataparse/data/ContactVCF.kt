package com.czlucius.scan.dataparse.data

import com.czlucius.scan.dataparse.TypeInts
import ezvcard.Ezvcard
import ezvcard.VCard

class ContactVCF(raw: String): Data(TypeInts.TYPE_CONTACT, raw) {
    val contact: VCard = Ezvcard.parse(raw).first()
}