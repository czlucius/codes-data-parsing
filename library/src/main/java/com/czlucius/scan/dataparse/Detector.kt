package com.czlucius.scan.dataparse

import com.czlucius.scan.dataparse.data.Data

abstract class Detector {
    /**
     * Retrieves the data from a type.
     * @return Data if Data is present, and null if no data is present(which is impossible.)
     */
    protected abstract fun getData(raw: String): Data?

}