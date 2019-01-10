package homework.testing.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The Class UnitTestingHomework_Tests.
 */
public class UnitTestingHomework_Tests {


    /**
     * Tests the sqrt function for number greater than max integer value, should throw an exception
     * outside boundary condition
     */
    @Test
    void sqrt_test_bound() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
        assertThrows(RuntimeException.class, () -> testObj.sqrt(Integer.MAX_VALUE+1));
    	
    }
    
    /**
     * Tests the sqrt function for number greater than max integer value,
     * if the program does not throw an exception then it should return the same 
     * return code for two invalid inputs
     */
    @Test
    void sqrt_test_bound_code() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(testObj.sqrt(Integer.MAX_VALUE+100),testObj.sqrt(Integer.MAX_VALUE+1));    	
    	
    }
    
    /**
     * Tests the sqrt function for -5, should throw an exception for invalid input
     * outside boundary condition
     */
    @Test
    void sqrt_test_negnum() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
        assertThrows(RuntimeException.class, () -> testObj.sqrt(-5));
    	
    }
    
    /**
     * Tests the sqrt function for a negative number which is ivalid input
     * if the program does not throw an exception then it should return the same 
     * return code for two invalid inputs
     */
    @Test
    void sqrt_test_negnum_code() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(testObj.sqrt(-1),testObj.sqrt(-5));    	
    	
    }
    
    /**
     * Tests the sqrt function for max integer value, should return 46340.950
     * This is boundary condition with valid input
     */
    @Test
    void sqrt_test_max() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(46340.950,testObj.sqrt(Integer.MAX_VALUE),0.001);    	
    }
	
    /**
     * Tests the sqrt function for min integer value, should throw an execption
     * This is a boundary condition with invalid input
     */
    @Test
    void sqrt_test_min() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
        assertThrows(RuntimeException.class, () -> testObj.sqrt(Integer.MIN_VALUE));
    	
    }
    
    /**
     * Tests the sqrt function for a negative number which is ivalid input
     * if the program does not throw an exception then it should return the same 
     * return code for two invalid inputs
     * This is a boundary condition with invalid input
     */
    @Test
    void sqrt_test_min_code() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(testObj.sqrt(-500),testObj.sqrt(Integer.MIN_VALUE));    	
    	
    }
    
    /**
     * Tests the sqrt function for zero, should return zero
     * Valid input within equivalence class
     */
    @Test
    void sqrt_test_zero() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(0.0,testObj.sqrt(0),0.001);
    }
    
	
    /**
     * Tests the sqrt function for 4, should return 2.0
     * Valid input within equivalence class

     */
    @Test
    void sqrt_test_pos() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(2.0,testObj.sqrt(4),0.001);
    }
    
    /**
     * Tests the sqrt function for 5, should return 2.236
     * Valid input within equivalence class

     */
    @Test
    void sqrt_test_pos_dec() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(2.236,testObj.sqrt(5),0.001);
    }
    
    
    /**
     * Tests the sqrt function for 2346, should return 48.435
     * Valid input within equivalence class
     */
    @Test
    void sqrt_test_posbig_dec() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(48.435,testObj.sqrt(2346),0.001);
    }
    
    /**
     * Tests the sqrt function for 63335, should return 251.664
     * Valid input within equivalence class
     */
    @Test
    void sqrt_test_poshuge_dec() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(251.664,testObj.sqrt(63335),0.001);
    }
    
    /**
     * Tests the sqr function for MAX_VAL, should return a exception 
     * outside boundary
     */
    @Test
    void sqr_test_max() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
        assertThrows(RuntimeException.class, () -> testObj.sqr(Integer.MAX_VALUE));
    	
    }
    
    /**
     * Tests the sqr function for MAX_VAL, should return a exception 
     * if the program does not throw an exception then it should return the same 
     * return code for two invalid inputs
     * outside boundary
     */
    @Test
    void sqr_test_max_code() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(testObj.sqr(Integer.MAX_VALUE+10),testObj.sqr(Integer.MAX_VALUE));
    	
    }
    
    /**
     * Tests the sqr function for 46342, should return a exception 
     * invalid boundary condition input 
     */
    @Test
    void sqr_test_bound() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
        assertThrows(RuntimeException.class, () -> testObj.sqr(46342));
    	
    }
    
    /**
     * Tests the sqr function for 46342, should return a exception 
     * if the program does not throw an exception then it should return the same 
     * return code for two invalid inputs
     * outside boundary
     */
    @Test
    void sqr_test_bound_code() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(testObj.sqr(46346),testObj.sqr(46342));
    	
    }
	
    
    /**
     * Tests the sqr function for -46342, should return a exception 
     * invalid boundary condition input 
     */
    @Test
    void sqr_test_negbound() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
        assertThrows(RuntimeException.class, () -> testObj.sqr(-46342));
    	
    }
    
    /**
     * Tests the sqr function for -46342, should return a exception 
     * if the program does not throw an exception then it should return the same 
     * return code for two invalid inputs
     * outside boundary
     */
    @Test
    void sqr_test_negbound_code() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(testObj.sqr(-46346),testObj.sqr(-46342));
    	
    }
    
    /**
     * Tests the sqr function for min integer value, should throw an execption
     * outside boundary
     */
    @Test
    void sqr_test_min() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
        assertThrows(RuntimeException.class, () -> testObj.sqr(Integer.MIN_VALUE));
    	
    }
    
    /**
     * Tests the sqr function for min integer value, should throw an execption
     * if the program does not throw an exception then it should return the same 
     * return code for two invalid inputs
     * outside boundary
     */
    @Test
    void sqr_test_min_code() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(testObj.sqr(Integer.MIN_VALUE-10),testObj.sqr(Integer.MIN_VALUE));    	
    }
    
    /**
     * Tests the sqr function for 46340, should return 2147395600
     * Valid boundary input within equivalence class
     */
    @Test
    void sqr_test_upperbound() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(2147395600,testObj.sqr(46340));
    }
    
    /**
     * Tests the sqr function for -46340, should return 2147395600
     * Valid boundary input within equivalence class
     */
    @Test
    void sqr_test_lowerbound() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(2147395600,testObj.sqr(-46340));
    }
    
    /**
     * Tests the sqr function for zero, should return zero
     * Valid input within equivalence class
     */
    @Test
    void sqr_test_zero() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(0,testObj.sqr(0));
    }
    
    /**
     * Tests the sqr function for negative zero, should return a zero
     * Valid input within equivalence class

     */
    @Test
    void sqr_test_neg_zero() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(0,testObj.sqr(-0));
    }
	
    /**
     * Tests the sqr function for 4, should return 16
     * Valid input within equivalence class

     */
    @Test
    void sqr_test_pos() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(16,testObj.sqr(4));
    }
    
    /**
     * Tests the sqr function for 5, should return 25
     * Valid input within equivalence class

     */
    @Test
    void sqr_test_pos_dec() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(25,testObj.sqr(5));
    }
    
    
    /**
     * Tests the sqr function for 2346, should return 5503716
     * Valid big input within equivalence class 
     */
    @Test
    void sqr_test_posbig_dec() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(5503716,testObj.sqr(2346));
    }
    
    /**
     * Tests the sqr function for -35, should return 1225
     * Valid negative input within equivalence class
     */
    @Test
    void sqr_test_neg() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(1225,testObj.sqr(-35));
    }
    
    /**
     * Tests the sqr function for -3508, should return 12306064
     * Valid big negative input within equivalence class
     */
    @Test
    void sqr_test_neghuge() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(12306064,testObj.sqr(-3508));
    }
    
    /**
     * Tests the factorial function for 21, should return a exception
     * outside boundary
     */
    @Test
    void fact_test_max() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
        assertThrows(RuntimeException.class, () -> testObj.factorial(21));
    	
    }
    
    /**
     * Tests the factorial function for 21, should return a exception 
     * if the program does not throw an exception then it should return the same 
     * return code for two invalid inputs
     * outside boundary
     */
    @Test
    void fact_test_max_code() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(testObj.factorial(21),testObj.factorial(13));
    	
    }
    
    
	
    /**
     * Tests the factorial function for 13, should return a exception 
     */
    @Test
    void fact_test_bound() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
        assertThrows(RuntimeException.class, () -> testObj.factorial(13));
    	
    }
    
    /**
     * Tests the factorial function for -2, should return a exception 
     * if the program does not throw an exception then it should return the same 
     * return code for two invalid inputs
     * outside boundary
     */
    @Test
    void fact_test_bound_code() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(testObj.factorial(15),testObj.factorial(13));
    	
    }
    
    /**
     * Tests the factorial function for -2, should return a exception 
     * outside boundary
     */
    @Test
    void fact_test_negnum() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
        assertThrows(RuntimeException.class, () -> testObj.factorial(-2));
    	
    }
    
    /**
     * Tests the factorial function for -2, should return a exception 
     * if the program does not throw an exception then it should return the same 
     * return code for two invalid inputs
     * outside boundary
     */
    @Test
    void fact_test_negnum_code() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(testObj.factorial(15),testObj.factorial(-2));
    	
    }
    
    /**
     * Tests the factorial function for zero, should return 1
     * Valid boundary input within equivalence class
     */
    @Test
    void fact_test_zero() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(1,testObj.factorial(0));
    }
    
    /**
     * Tests the factorial function for 1, should return 1
     * Valid boundary negative input within equivalence class
     */
    @Test
    void fact_test_one() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(1,testObj.factorial(1));
    }
	
    /**
     * Tests the factorial function for 4, should return 24
     * Valid input within equivalence class
     */
    @Test
    void fact_test_pos() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(24,testObj.factorial(4));
    }
    
    /**
     * Tests the factorial function for 5, should return 120
     * Valid input within equivalence class
     */
    @Test
    void fact_test_pos_dec() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(120,testObj.factorial(5));
    }
    
    
    /**
     * Tests the factorial function for 12, should return 479001600
     * Valid big boundary input within equivalence class
     */
    @Test
    void fact_test_posbig_dec() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(479001600,testObj.factorial(12));
    }
    
    /**
     * Tests the factorial function for 11, should return 39916800
     * Valid big boundary input within equivalence class
     */
    @Test
    void fact_test_neg() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(39916800,testObj.factorial(11));
    }
    
    /**
     * Tests the sumUp function for -3, should return an exception
     * invalid input outside boundary
     */
    @Test
    void sumUp_test_neg() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
        assertThrows(RuntimeException.class, () -> testObj.sumUp(-3));
    }
    
    /**
     * Tests the sumUp function for -3, should return an exception
     * if the program does not throw an exception then it should return the same 
     * return code for two invalid inputs
     * invalid input outside boundary
     */
    @Test
    void sumUp_test_neg_code() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(testObj.sumUp(-7),testObj.sumUp(-3));
    }
   
    /**
     * Tests the sumUp function for 20, should return 210
     * Valid input within equivalence class
     */
    @Test
    void sumUp_test_posnum() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(210,testObj.sumUp(20));
    }
    
    /**
     * Tests the sumUp function for 5, should return 15
     * Valid input within equivalence class
     */
    @Test
    void sumUp_test_pos() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(15,testObj.sumUp(5));
    }
    
    /**
     * Tests the sumUp function for 1, should return 1
     * Valid boundary input within equivalence class
     */
    @Test
    void sumUp_test_one() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(1,testObj.sumUp(1));
    }
    
    /**
     * Tests the sumUp function for 0, should return 0
     * Valid boundary input within equivalence class
     */
    @Test
    void sumUp_test_zero() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(0,testObj.sumUp(0));
    }
    
    /**
     * Tests the sumUp function for 65535, should return 2147450880
     * valid boundary input within equivalence class
     */
    @Test
    void sumUp_test_max() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(2147450880,testObj.sumUp(65535));
    }
    
    /**
     * Tests the sumUp function for 65532, should return an exception
     * invalid input outside boundary
     */
    @Test
    void sumUp_test_bound() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
        assertThrows(RuntimeException.class, () -> testObj.sumUp(65532));
    }
    
    /**
     * Tests the sumUp function for 65532, should return an exception
     * if the program does not throw an exception then it should return the same 
     * return code for two invalid inputs
     * invalid input outside boundary
     */
    @Test
    void sumUp_test_bound_code() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(testObj.sumUp(65538),testObj.sumUp(65532));
    }
    
    
    /**
     * Tests the XplusY function for MAX_VALUE and 10 should throw exception
     * invalid input outside boundary
     */
    @Test
    void xplusY_test_bound() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
        assertThrows(RuntimeException.class, () -> testObj.simpleFunctionXplusY(Integer.MAX_VALUE, 10));
    }
    
    /**
     * Tests the XplusY function for MAX_VALUE and 10 should throw exception
     * if the program does not throw an exception then it should return the same 
     * return code for two invalid inputs
     * invalid input outside boundary
     */
    @Test
    void xplusY_test_bound_code() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(testObj.simpleFunctionXplusY(Integer.MAX_VALUE, 20),testObj.simpleFunctionXplusY(Integer.MAX_VALUE, 10));
    }
    
    /**
     * Tests the XplusY function for MIN_VALUE and -10 should throw exception
     * invalid input outside boundary
     */
    @Test
    void xplusY_test_lowerbound() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
        assertThrows(RuntimeException.class, () -> testObj.simpleFunctionXplusY(Integer.MIN_VALUE, -10));
    }
    
    /**
     * Tests the XplusY function for MIN_VALUE and -10 should throw exception
     * if the program does not throw an exception then it should return the same 
     * return code for two invalid inputs
     * invalid input outside boundary
     */
    @Test
    void xplusY_test_lowerbound_code() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(testObj.simpleFunctionXplusY(Integer.MIN_VALUE, -20),testObj.simpleFunctionXplusY(Integer.MIN_VALUE, -10));
    }
    
    /**
     * Tests the XplusY function for MAX_VALUE and 0, should return MAX_VALUE
     * valid boundary input within equivalence class
     */
    @Test
    void xplusY_test_max() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(Integer.MAX_VALUE,testObj.simpleFunctionXplusY(Integer.MAX_VALUE, 0));
    }
    
    /**
     * Tests the XplusY function for 0 and MAX_VALUE, should return MAX_VALUE
     * valid boundary input within equivalence class
     */
    @Test
    void xplusY_test_maxval() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(Integer.MAX_VALUE,testObj.simpleFunctionXplusY(0, Integer.MAX_VALUE));
    }
    
    /**
     * Tests the XplusY function for 0 and MIN_VALUE, should return MIN_VALUE
     * valid boundary input within equivalence class
     */
    @Test
    void xplusY_test_minval() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(Integer.MIN_VALUE,testObj.simpleFunctionXplusY(0, Integer.MIN_VALUE));
    }
    
    /**
     * Tests the XplusY function for MIN_VALUE and 0, should return MIN_VALUE
     * valid boundary input within equivalence class
     */
    @Test
    void xplusY_test_min() {
    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(Integer.MIN_VALUE,testObj.simpleFunctionXplusY(Integer.MIN_VALUE,0));
    }
    
    
    /**
     * Tests the XplusY function for positive values within the equivalence partitioning range.
     * input of 5 and 10 should return 15
     * valid input within equivalence class
     */
   @Test
    void xplusY_test_pos() {
     	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
    	assertEquals(15,testObj.simpleFunctionXplusY(5,10));
    }
   
	   /**
	    * Tests the XplusY function for one positive and one negative value  within the equivalence 
	    * partitioning range.
	    * input of -5 and 10 should return 5
	    */
	  @Test
	   void xplusY_test_negpos() {
	    	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
	   	assertEquals(5,testObj.simpleFunctionXplusY(-5,10));
	   }
	   
	  /**
	   * Tests the XplusY function for one positive and one negative value  within the equivalence 
	   * partitioning range.
	   * input of 100 and -80 should return 20
	   */
	 @Test
	  void xplusY_test_posneg() {
	   	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
	  	assertEquals(20,testObj.simpleFunctionXplusY(100,-80));
	  }
	 
	  /**
	   * Tests the XplusY function for both negative values within the equivalence 
	   * partitioning range.
	   * input of -1000 and -800 should return 20
	   */
	 @Test
	  void xplusY_test_neg() {
	   	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
	  	assertEquals(-1800,testObj.simpleFunctionXplusY(-1000,-800));
	  }
	 
	  /**
	   * Tests the XplusY function for both zero values within the equivalence 
	   * partitioning range.
	   * input of 0 and 0 should return 0
	   */
	 @Test
	  void xplusY_test_zero() {
	   	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
	  	assertEquals(0,testObj.simpleFunctionXplusY(0,0));
	  }
	 
	  /**
	   * Tests the despacer function for null value
	   * input of null should throw a nullPointer exception
	   */
	 @Test
	  void despacer_test_null() {
	   	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
        assertThrows(NullPointerException.class, () -> testObj.despacer(null));
	  }
	 
	  /**
	   * Tests the despacer function for empty string
	   * input of empty string should return an empty string
	   */
	 @Test
	  void despacer_test_empty() {
	   	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
	  	assertEquals("",testObj.despacer(""));
	  }
	 
	  /**
	   * Tests the despacer function for a string without spaces should return back the same string
	   * input of "vai" should return back "vai"
	   */
	 @Test
	  void despacer_test_nospace() {
	   	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
	  	assertEquals("vai",testObj.despacer("vai"));
	  }
	 
	  /**
	   * Tests the despacer function for a string with single space should return back the same string
	   * input of " vaibhav" should return back " vaibhav"
	   */
	 @Test
	  void despacer_test_space() {
	   	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
	  	assertEquals(" vaibhav",testObj.despacer(" vaibhav"));
	  }
	 
 
	  /**
	   * Tests the despacer function for a string with single space should return back the same string
	   * input of "vaibhav " should return back "vaibhav "
	   */
	 @Test
	  void despacer_test_spaceEnd() {
	   	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
	  	assertEquals("vaibhav ",testObj.despacer("vaibhav "));
	  }
	 
	  /**
	   * Tests the despacer function for a string with single space should return back the same string
	   * input of " vaibhav " should return back " vaibhav "
	   */
	 @Test
	  void despacer_test_spaceboth() {
	   	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
	  	assertEquals(" vaibhav ",testObj.despacer(" vaibhav "));
	  }
	 
	  /**
	   * Tests the despacer function for a string with two space should replace it with a single space
	   * input of " vai bhav " should return back " vai  bhav "
	   */
	 @Test
	  void despacer_test_spaces() {
	   	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
	  	assertEquals(" vai bhav ",testObj.despacer(" vai  bhav "));
	  }
	 
	  /**
	   * Tests the despacer function for a string with three space should replace it with a single space
	   * input of " vai bhav " should return back "    vai  bhav "
	   */
	 @Test
	  void despacer_test_multspaces() {
	   	UnitTestingHomework testObj = new UnitTestingHomeworkImpl();
	  	assertEquals(" vai bhav ",testObj.despacer("   vai  bhav "));
	  }
	 
}
