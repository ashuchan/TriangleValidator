# TriangleValidator
Assignment from Tradeshift

Solution is designed with SOLID principles in mind.  
###Following interfaces:
1. #### TriangleQualifier: 
            This interface defines contract to qualify an input triangle. It has concrete implementations for Equilateral and Isosceles Triangles. Future implementation can include RightAngleTriangleQualifier.  
2. #### TriangleValidation:
            This interface is to provide validation for a triangle. Two concrete implementations exist to validate a triangle for side lengths being positive and sum of any two sides should be greater than the third one validity.  

###DataModel:
1. #### Triangle:
            A POJO to represent Triangle in application.
