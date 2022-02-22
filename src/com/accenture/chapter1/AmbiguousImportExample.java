package com.accenture.chapter1;


import java.util.*;
import java.sql.*;
//import java.util.Date;
//import java.sql.Date; //Does not compile

public class AmbiguousImportExample {
	private Date date; // Does not compile
	
	private java.sql.Date sqlDate;
}
