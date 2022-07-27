object ReferentialIntegrity {
  /*  
  Runs a Referential Integrity check between two data sets provided by the customer 
  
  @param ds1        The data set in which the customer will select the column to do the Referential Integrity check.  
  @param col1       The column that will be use as the subset for the Refernetial Integrity check.  
  @param ds2        The data set in which the customer chooses the second column for the Referential Integrity check.  
  @param col2       The column that that will serve as the main set for the Referential Integrity check.  
  @param Assertion  The customer inputs a function and we supply a Double to that function, to obtain a Boolean.  
  
  @return Boolean   Internally we calculate the referntial integrity as a percentage, and we run the assertion 
                    on that outcome that ends up being a true or false reponse.  
  
  */  
   def subsetCheck(
    dataSet1: DataFrame,    
    column1: String,    
    dataSet2: DataFrame,    
    column2: String,    
    Assertion: Double => Boolean): Boolean
}
