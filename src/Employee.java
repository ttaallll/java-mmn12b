// Fig. 10.4: Employee.java
// Employee abstract superclass.

import java.util.Calendar;

public abstract class Employee
{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
   private final BirthDate birthdate;

   // constructor
   public Employee(
           String firstName,
           String lastName,
           String socialSecurityNumber,
           BirthDate birthdate
   )
   {
      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;
      this.birthdate = birthdate;
   } 

   // return first name
   public String getFirstName()
   {
      return firstName;
   } 

   // return last name
   public String getLastName()
   {
      return lastName;
   } 

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   }

   // return social birth date
   public BirthDate getBirthdate()
   {
      return birthdate;
   }

   // return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format("%s %s%nsocial security number: %s, birth date: %s%s",
         getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthdate(), birthdayBonusMessage());
   } 

   // abstract method must be overridden by concrete subclasses
   public abstract double earnings(); // no implementation here

   public boolean isBirthdayMonth() {
      int currentMonth = java.util.Calendar.getInstance().get(Calendar.MONTH) + 1;

      return birthdate.month == currentMonth;
   }

   public int birthdayBonus(){
      if (isBirthdayMonth())
         return 200;

      return 0;
   }

   public String birthdayBonusMessage() {
      if (isBirthdayMonth())
         return ", have birthday this month (+200 for salary)";

      return "";
   }
} // end abstract class Employee


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/