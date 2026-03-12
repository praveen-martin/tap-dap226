
@feature_open_create_new_job_opening
Feature: OpenCreateNewJobOpeningFor

Background: 
  Given the user is on the Job Opening screen

@verify_add_job_opening
Scenario Outline: Open Create New Job Opening Form
  When I locate the Add Job Opening button
  And I click on the Add Job Opening button
  Then the Create New Job Opening form is displayed
  And the form contains fields for job title, description, requirements, and other relevant information
  And the form displays Save and Cancel buttons

Examples:
  | <job_opening_button> |
  | Add Job Opening       |

  @save_button_enabled
  Scenario Outline: Open Create New Job Opening Form
    Given the user fills in the job title field with a valid title "<job_title>"
    And the user fills in the job description field with a valid description "<job_description>"
    And the user fills in the job requirements field with valid requirements "<job_requirements>"
    And the user ensures all required fields are filled
    Then the Save button is enabled
    And the Cancel button remains enabled

    Examples:
      | job_title            | job_description                                                  | job_requirements                                     |
      | Software Engineer    | Responsible for developing and maintaining software applications.| Bachelor's degree in Computer Science, 3+ years of experience in software development. |

  @cancel_button_functionality
  Scenario Outline: Open Create New Job Opening Form
    When the user clicks the Cancel button in the Create New Job Opening form
    Then the Create New Job Opening form is closed
    And the user is returned to the Job Opening screen

  Examples:
    |  |
    |  |

@validation_empty_fields
Scenario Outline: Open Create New Job Opening Form
  When the user leaves the job title field empty
  And the user leaves the job description field empty
  And the user leaves the job requirements field empty
  And the user clicks the Save button
  Then validation messages are displayed for the empty job title field
  And validation messages are displayed for the empty job description field
  And validation messages are displayed for the empty job requirements field
  And the Save button remains disabled

  Examples:
    | job_title | job_description | job_requirements |
    |           |                  |                   |

  @validation_error_display
  Scenario Outline: Open Create New Job Opening Form
    Given I fill in the job title field with "<job_title>"
    And I leave the job description field empty
    And I fill in the job requirements field with "<job_requirements>"
    When I click the Save button
    Then validation messages are displayed for the empty job description field
    And the job title field retains the entered value
    And the job requirements field retains the entered value

    Examples:
      | job_title          | job_requirements                                                                 |
      | Software Engineer   | Bachelor's degree in Computer Science, 3+ years of experience in software development, proficiency in Java and Python |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    When I enter "<job_title>" in the job title field
    And I enter "<job_description>" in the job description field
    And I enter "<requirements>" in the requirements field
    And I click the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with the special characters in the title

    Examples:
      | job_title                   | job_description | requirements |
      | Senior Developer @ XYZ     | a * 100         | a * 100      |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    When I enter "<job_requirements>" in the job requirements field
    And I enter "<job_title>" in the job title field
    And I enter "<job_description>" in the job description field
    And I click the Save button
    Then the form should save successfully without any validation errors
    And the job opening should be created with numeric values in the requirements

    Examples:
      | job_requirements | job_title          | job_description                                       |
      | 5                | Software Engineer   | Responsible for developing and maintaining software applications. |

  @job-requirements-entry
  Scenario Outline: Open Create New Job Opening Form
    When I enter "<job_title>"
    And I enter "<job_description>"
    And I enter "<requirements>"
    And I click the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with all job requirements listed

    Examples:
      | job_title          | job_description                                          | requirements                                     |
      | Software Engineer   | Responsible for developing and maintaining software applications. | 5+ years experience; Proficient in Java; Team player |

  @valid_create_job_opening
  Scenario Outline: Open Create New Job Opening Form
    Given the admin fills in the job title with "<job_title>"
    And the admin fills in the description with "<description>"
    And the admin leaves the salary field empty
    And the admin leaves the location field empty
    When the admin clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with the optional fields left empty

    Examples:
      | job_title           | description                                   |
      | Software Engineer    | Develop and maintain software applications.  |

@valid-job-opening
Scenario Outline: Open Create New Job Opening Form
  Given the user is on the Create New Job Opening Form
  When I enter "<job_description>"
  And I enter "<job_title>"
  And I enter "<job_requirements>"
  And the user clicks the Save button
  Then the form saves successfully without any validation errors
  And the job opening is created with special characters in the description

  Examples:
    | job_description                                             | job_title          | job_requirements                           |
    | Looking for a developer with experience in C# & .NET     | Software Developer  | Must have experience in C#, .NET, and SQL. |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given I enter a job title "<job_title>"
    And I fill in the job description "<job_description>"
    And I fill in the job requirements "<job_requirements>"
    When I click the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with the job title trimmed of whitespace

    Examples:
      | job_title          | job_description          | job_requirements         |
      | Senior Developer   | Job description a * 100  | Job requirements a * 100  |

  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user is on the Create New Job Opening Form
    When I enter "<job_description>"
    And I enter "<job_title>"
    And I enter "<requirements>"
    And the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with the HTML tags rendered correctly

    Examples:
      | job_description              | job_title          | requirements |
      | <b>Looking for a developer</b> | Software Developer | a * 100      |

  @valid_email_format
  Scenario Outline: Open Create New Job Opening Form
    When I enter "<job_description>"
    And I enter "<job_title>"
    And I enter "<requirements>"
    And the user clicks the Save button
    Then the form saves successfully without any validation errors
    And the job opening is created with the email format included in the description

    Examples:
      | job_description                   | job_title         | requirements                                         |
      | Contact us at hr@example.com     | Software Engineer  | Experience with automation testing and CI/CD tools. |

  @disabled_save_button
  Scenario Outline: Open Create New Job Opening Form
    When the user leaves the job title field empty
    And the user fills in the job description field with "<job_description>"
    And the user fills in the job requirements field with "<job_requirements>"
    Then the Save button should be disabled
    And the Cancel button should remain enabled

    Examples:
      | job_description                                                                                         | job_requirements                                                               |
      | A valid job description that provides a clear overview of the job responsibilities and expectations.    | A list of valid job requirements that are necessary for the position.        |

  @invalid-job-title
  Scenario Outline: Open Create New Job Opening Form
    Given the user enters a job title "<job_title>"
    And the user fills in the job description "<job_description>"
    And the user fills in the job requirements "<job_requirements>"
    When the user clicks the Save button
    Then an error message is displayed indicating the job title is too short
    And the Save button remains disabled

    Examples:
      | job_title | job_description                                           | job_requirements                              |
      | A         | This is a valid job description that meets the requirements. | These are the valid job requirements. |

  @invalid_job_description
  Scenario Outline: Open Create New Job Opening Form
    Given I enter a job description that exceeds the maximum character limit
    And I enter "<job_title>"
    And I enter "<requirements>"
    When I click the Save button
    Then an error message is displayed indicating the job description exceeds the character limit
    And the Save button remains disabled

    Examples:
      | job_title          | requirements                                                                                          |
      | Software Engineer   | Bachelor's degree in Computer Science or related field, 3+ years of experience in software development, proficiency in Java and Python. |

  @duplicate_job_title
  Scenario Outline: Open Create New Job Opening Form
    When I enter "<job_title>"
    And I fill in the job description with "<job_description>"
    And I fill in the requirements with "<requirements>"
    And I click the Save button
    Then an error message should be displayed indicating the job title already exists
    And the Save button should remain disabled

    Examples:
      | job_title           | job_description                                    | requirements                                                       |
      | Software Engineer    | Develop and maintain software applications.       | Bachelor's degree in Computer Science or related field, 3+ years of experience. |

  @invalid-job-title
  Scenario Outline: Open Create New Job Opening Form
    Given the user enters "<job_title>" in the job title field
    And the user enters "<job_description>" in the job description field
    And the user enters "<requirements>" in the requirements field
    When the user clicks the Save button
    Then an error message should be displayed indicating invalid characters in the job title
    And the Save button remains disabled

    Examples:
      | job_title       | job_description       | requirements        |
      | Developer #1    | Job description a * 100 | Requirements a * 100 |

  @job_title_exceeds_limit
  Scenario Outline: Open Create New Job Opening Form
    Given the user enters a job title "<job_title>"
    And the user fills in the job description "<job_description>"
    And the user fills in the requirements "<requirements>"
    When the user clicks the Save button
    Then an error message is displayed indicating the job title exceeds the character limit
    And the Save button remains disabled

    Examples:
      | job_title                                                | job_description                  | requirements                   |
      | This is a very long job title that exceeds the limit    | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @error_message_exceeds_limit
  Scenario Outline: Open Create New Job Opening Form
    Given the user enters job requirements that exceed the maximum character limit
    When the user enters "<job_requirements>"
    And the user enters "<job_title>"
    And the user enters "<job_description>"
    And the user clicks the Save button
    Then an error message is displayed indicating the job requirements exceed the character limit
    And the Save button remains disabled

    Examples:
      | job_requirements                                                                                                                                              | job_title         | job_description                                                                                                                |
      | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | Software Engineer | We are looking for a skilled software engineer with experience in developing applications.                                   |

@validate_max_character_limits
Scenario Outline: Open Create New Job Opening Form
  Given the user enters a job title that meets the maximum character limit
  And the user enters a job description that meets the maximum character limit
  And the user enters job requirements that meet the maximum character limit
  When the user clicks the Save button
  Then the form saves successfully without any validation errors
  And the job opening is created with all fields populated to their maximum limits

  Examples:
    | job_title                                                                                     | job_description                                                                                     | job_requirements                                                                                     |
    | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa |

  @empty-fields-validation
  Scenario Outline: Open Create New Job Opening Form
    When the user leaves all fields empty
    And the user clicks the Save button
    Then validation messages are displayed for all required fields
    And the Save button remains disabled

    Examples:
      | <field> |
      |         |
