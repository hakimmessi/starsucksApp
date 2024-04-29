package com.st10082700.starsucks

class Order {
    lateinit var productName: String
    lateinit var customerName: String
    lateinit var customerCell: String
    lateinit var orderDate: String

    // default empty constructor
    constructor() {}

    //secondary constructor
    constructor(pName: String) {
        productName = pName
    }

    constructor(pName: String, cName: String, cCell: String, oDate: String): this(pName) {
        customerName = cName;
        customerCell = cCell;
        orderDate = oDate;
    }


}
//-----------------------------------------end of file----------------------------------------