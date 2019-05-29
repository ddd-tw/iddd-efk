# Background
* A company provides IT Body Leasing (接案). They have some Employees, and also a lot of Freelancers as Subcontractors. Currently, they use Excel sheets to manage their Customers, Freelancers, Timesheets and so on.
* New goal: to build a new web based solution with role based security * Requirement summary
* A searchable catalog of Freelancer must be provided
* The new solution must allow to store the different Communication Channels (e.g. email, fax, mobile) available to contact a Freelancer
* A searchable catalog of Projects must be provided
* A searchable catalog of Customers must be provided
* The Timesheets for the Freelancers under contract must be maintained

## Example usage scenarios
* Freelancer moved to new location address
* A Customer can only be deleted if there is no Project assigned
* Once a Timesheet is entered, the Customer needs to be billed
* Work shop tasks
* Identify the entries and non-entities in the requirements * List the attributes and operations of the entities

## 4 subdomains there: 
* Identity and Access Management Subdomain
* Customer Management Subdomain
* Freelancer Management Subdomain
* Project Management Subdomain

## Let’s divide into team to work out the model!

* A searchable catalog of Freelancer must be provided
* The new solution must allow to store the different Communication Channels (e.g. email, fax, mobile) available to contact a Freelancer
* A searchable catalog of Projects must be provided
* A searchable catalog of Customers must be provided
* The Timesheets for the Freelancers under contract must be maintained
* Freelancer moved to new location address
* A Customer can only be deleted if there is no Project assigned
* Once a Timesheet is entered, the Customer needs to be billed

## Key Entity Characteristics:
* Unique identity
* Not just attributes
* We care about the changes
* Work shop tasks
* Identify the entities and non-entities in the requirements * List the attributes and operations of the entities


## Summary
* We care about the unique identity and mutability (changing) characteristics of entities
* The four primary ways to generate Entity unique identities
* How to discover the entities, and their properties and operations from the requirements (uncovering the ubiquitous language)
* Define entity roles with interfaces
* Entity construction, and validation suggestions