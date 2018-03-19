# TriangleValidator
Assignment from Tradeshift

Solution is designed with SOLID principles in mind.  
### Following interfaces:
1. #### TriangleQualifier: 
            This interface defines contract to qualify an input triangle. It has concrete implementations for Equilateral and Isosceles Triangles. Future implementation can include RightAngleTriangleQualifier.  
2. #### TriangleValidation:
            This interface is to provide validation for a triangle. Two concrete implementations exist to validate a triangle for side lengths being positive and sum of any two sides should be greater than the third one validity.  

### DataModel:
1. #### Triangle:
            A POJO to represent Triangle in application.

### Test:
1. #### TriangleFunctionalTest:
            This test class covers the functionality of the application and can be run to verify tests.

### Application:
#### Application.java
            This utility class can be invoked from command prompt by passing in three integers which represent the sides of a triangle to get the output which tells what kind of triangle it is:
            Returns:- "Equilateral" in case all sides are equal
                      "Isosceles" in case any two sides are equal
                      "Scalene" otherwise
