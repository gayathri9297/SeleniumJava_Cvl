Feature: Job Search functionality
     In order to search for a job
     As a user with more search options
     I have to provide job title and salary

  Scenario Outline: Verify job search functionality with more search options
    Given I navigate to url "https://www.cv-library.co.uk/"
    Then I should be directed to home page
    When I enter job title as "<jobTitle>"
    And I click on more search options
    And I enter salary min as "<salaryMin>"
    And I enter salary max as "<salaryMax>"
    And I click on find jobs
    Then I should see corresponding results for the given details

    Examples:
    |      jobTitle            | salaryMin      | salaryMax      |
    |     developer            |     30000      |   50000        |
    |      designer            |     10000      |   30000        |
    |       sdet               |     40000      |   60000        |
