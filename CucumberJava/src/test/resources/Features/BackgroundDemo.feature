Feature: To get Student detail.
  
  Scenario: Sudent enroll verification
    Given student qualified
    When Student entered name as "Sonu"
    And Student entered gender as "Male"
    Then Student will be enrolled in college
