Learning outcomes and what I've done for them, up until now. For a more detailed explanation of my progress please see: https://github.com/Coen-Donk/Semester-3-software/wiki/Portfolio-individual-project

### 1. You design and build user-friendly, full-stack web applications.

For now I've designed a [basic full stack web application](https://vue-space-lb8g42a1u-coendonk.vercel.app/) . The web socket is yet to be connected online, but it does work offline and the code is visible here on github. 

(I am considering of keeping it like this for now as the online Web App will still function if you host the Web Socket locally)

ORM Has been shown in a prototype project [here](https://github.com/Coen-Donk/Semester-3-software/tree/Development/Practice%20Projects/ORM/ORM%20Console)

My explanation as for why can be seen [here](https://github.com/Coen-Donk/Semester-3-software/wiki/Portfolio-individual-project#orm)

We've received feedback on our application during [sprint 2](https://github.com/Coen-Donk/Semester-3-software/wiki/Portfolio-Group-Project#ending-of-sprint-2). To show that we've received stakeholder feedback.

I've performed a usability tests together with two of my friends on my prototype. the results can be found [here](https://github.com/Coen-Donk/Semester-3-software/wiki/Usability-test-1-Results)

My contributions for the GP in terms of direct contributions, can be viewed here https://github.com/Coen-Donk/Semester-3-software/wiki/Portfolio-Group-Project#my-contributions-to-the-project

### 2. You use software tooling and methodology that continuously monitors and improve the software quality during software development.

For this learning outcome I've designed Unit testing inside my Web Socket application to ensure that the methods are all working correctly, as well as the connections. To ensure I've tested everything I gave myself the requirement to have a minimum of 90% Test coverage. 

I've also implemented integration tests on my Websocket back-end to ensure that all methods work together as well in the same session.
I've implented a UI test which is triggered through my Ci/Cd on the front-end git, the results can be viewed here [here](https://github.com/Coen-Donk/Vue-Space-App/actions/workflows/Cypress%20UI%20test.yml)

Further more I've also implemented Code Analysis whenever I attempt to push to my git 
Full detail can be viewed [here](https://github.com/Coen-Donk/Semester-3-software/wiki/Portfolio-individual-project#testing)

### 3. You choose and implement the most suitable agile software development method for your software project.

A report over my knowledges of agile working can be seen here:

I have already made a report on my research findings about Agile methodology frameworks, and I have designed user stories which you can see in my projects tab (These are not perfectly up-to-date as I'm prioritizing different aspects of what I want to learn instead of completing the project). 

You can find my findings [here](https://github.com/Coen-Donk/Semester-3-software/wiki/Agile-Report)
Explanation and argumentation about which methodology we've chosen in the group project and which one I chose in my IP can be seen [here](https://github.com/Coen-Donk/Semester-3-software/wiki/Agile-Report#agile-framework-choice)

[Link](https://trello.com/invite/b/4bBnZg2C/ATTIc4af5a64087bfbf2f8c158d8151621a7BE7BC3C4/sem-3-vue-space-app) to Trello with User stories, enablers, epics etc.

[link](https://github.com/Coen-Donk/Semester-3-software/wiki/Agile-Report#agile-framework-choice) to screenshots of the devops for my group project
[link](https://github.com/Coen-Donk/Semester-3-software/wiki/Portfolio-Group-Project#sprint-2) to screenshot of our burn down-chart for the group project
 
### 4. You design and implement a (semi)automated software release process that matches the needs of the project context.

CI has been created for the website which you can view [here](https://github.com/Coen-Donk/Vue-Space-App/settings/code_review_limits)

CD has been implemented as well, as any push to the github immediately pushes my code to vercel.app, and on sunday all code is automatically pushed to the vercel app as well.

Implemented Branching in Github. Feature -> Dev -> Testing -> Release -> Production. 

CI Has been implemented on the testing branch so that it executes the tests there. Only once those are passed can it go to the next branch.

### 5. You recognize and take into account cultural differences between project stakeholders and ethical aspects in software development.

For this learning outcome I covered what kind of differences I encountered in my semester 4 Creative Technology Team
You can find the report on this in [here](https://github.com/Coen-Donk/Semester-3-software/wiki/Cultural-differences-during-semester-4)

I've also made a report where I answer the [ethical questions](https://fhict.instructure.com/courses/13025/pages/ethics-analysis-do-you-think-about-ethical-consequences-from-the-software-you-make?module_item_id=916364) [here](https://github.com/Coen-Donk/Semester-3-software/wiki/Ethical-Report-Group-Project)

### 6. You analyze (non-functional) requirements, elaborate (architectural) designs and validate them using multiple types of test techniques.

I have analyzed the requirements in both my personal project and group project, and assessed the importance of each user story for the stakeholder (With the IP this is of course me, however with the GP this is mediaan)

You can view an image of the group project board [here](https://github.com/Coen-Donk/Semester-3-software/wiki/Portfolio-Group-Project#sprint-2)
The trello of my IP can be seen [here](https://trello.com/b/4bBnZg2C/sem-3-vue-space-app)
in both of these an importance of each user story can be seen with the story points.

I have designed an architectural design (the C4-model level 1 and 2) for my application. I have stuck with Level 1 and 2 for now as they best display the overall structure of the app and level 3 might still change frequently as my knowledge of Vue.js and the Java Web-socket changes. 
The documentation can be seen [here](https://github.com/Coen-Donk/Semester-3-software/tree/Development/Documentation)

I've created a [wireframe](https://github.com/Coen-Donk/Semester-3-software/blob/Development/Documentation/Images/Wireframe%20AsteroidPage.PNG
) to better understand my asteroidpage and clarify my future design for the stakeholders

I've also designed a prototype to perform usability tests with stakeholders and potential users. this can be found [here](https://github.com/Coen-Donk/Semester-3-software/assets/78910701/fddc6fc8-c71e-4699-b96e-05d36dc08180) and [here](https://github.com/Coen-Donk/Semester-3-software/assets/78910701/050025a3-063b-4f26-8e74-99cd0761c016)

A usability test has been performed with potential users, the report for which can be found [here](https://github.com/Coen-Donk/Semester-3-software/wiki/Usability-test-1-Results)

We've received feedback on our application during [sprint 2](https://github.com/Coen-Donk/Semester-3-software/wiki/Portfolio-Group-Project#ending-of-sprint-2). To show that we've received stakeholder feedback.

### 7. You analyze and describe simple business processes that are related to your project.

A busness process report can be viewed [here](https://github.com/Coen-Donk/Semester-3-software/wiki/Business-Process-Ping-pong).
This also contains the Business model with and without the application as well as an explanatin for it.

### 8.  You act in a professional manner during software development and learning.

I feel that up until now I have always stuck with a professional manner in both the GP and IP. With the GP I take into the account the feedback of the stakeholders together with my group mates and we keep the priority of the
client, instead of making our op priority. 

With the IP I frequently ask feedback on different aspects of my project and incorperate my feedback, or explain why I've gone a different route. The feedback I've received can be seen on feedpulse

This semester I also have to write Research reports (In specific two, one about security and one free of choice). A list of my Research reports will be written here

Web Sockets Compared to API's (Lacks experimentation and Connection to IP)
https://github.com/Coen-Donk/Semester-3-software/wiki/Research-Report-Web-sockets-compared-to-API's

Security report 
https://github.com/Coen-Donk/Semester-3-software/wiki/Security-Report-Web-Sockets

Research Plan for the Security report: https://github.com/Coen-Donk/Semester-3-software/wiki/Security-Report-Web-Sockets#research-plan-security-report

Agile Report 
https://github.com/Coen-Donk/Semester-3-software/wiki/Agile-Report
