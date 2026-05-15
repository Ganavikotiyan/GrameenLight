 alt="image" src="https://github.com/user-attachments/assets/100f085e-57da-4e86-8fb1-fb720ff72d0d" />4.1	Project Title
Grameen Light Energy – Smart Streetlight Monitoring and Energy Management System


4.2	Project Overview
The Grameen Light Energy application is a mobile-based solution developed to address the issue of inefficient streetlight management in rural and semi-urban areas. In many villages, streetlights remain switched ON during the daytime due to manual negligence or lack of monitoring systems. At the same time, faulty or non-functional streetlights often remain unattended for extended periods because there is no proper mechanism for reporting and tracking issues. These problems not only lead to significant energy wastage but also affect public safety and infrastructure reliability.
To overcome these challenges, the Grameen Light Energy application provides a structured, user-friendly, and technology-driven approach to monitor and manage streetlight systems. The application is designed to act as a bridge between the general public and local authorities by enabling citizens to actively participate in reporting issues and tracking their resolution. The system emphasizes simplicity and accessibility so that even users with minimal technical knowledge can operate it effectively.
The application consists of multiple interconnected modules that together form a complete workflow. The home interface serves as the central access point, providing options such as reporting an issue, viewing streetlight status, tracking complaints, and accessing the system dashboard. This structured navigation ensures that users can easily move between different functionalities without confusion.
One of the key components of the system is the streetlight issue reporting module. This feature allows users to report problems by simply entering the Pole ID associated with a streetlight. The reporting process is intentionally kept simple to encourage user participation. Once a report is submitted, the system generates a complaint entry that is stored and processed within the application.
The streetlight monitoring module provides a clear overview of all available streetlights. Each pole is displayed along with its operational status, using color-coded indicators for better
 

 
visualization. For example, green indicates a working condition, while red represents a faulty or under-repair condition. This visual representation allows users to quickly identify problem areas without needing complex technical understanding.
Another important feature is the complaint tracking system, which allows users to monitor the progress of reported issues. Each complaint is assigned a unique identifier, which can be entered into the system to retrieve its status. The system displays whether the issue is pending, in progress, or resolved, along with the associated Pole ID. This feature improves transparency and ensures that users are aware of the progress of their reports.
The application also includes a system dashboard, which provides a summarized view of overall activity. It displays information such as the total number of active complaints and detailed issue logs. This helps in understanding system performance and identifying frequently occurring problems. The dashboard plays an important role in decision-making and monitoring system efficiency.
Additionally, an admin control panel is implemented to manage reported issues. This module allows authorized users to mark complaints as resolved by entering the relevant Pole ID. It also includes an option to reset system data for testing or maintenance purposes. This ensures that the system is not only user-driven but also manageable from an administrative perspective.
From a technical standpoint, the application is developed using Android Studio and Kotlin, ensuring efficient performance and modern development practices. Data handling is implemented using Room Database, which allows storage and retrieval of complaint details and streetlight status. Proper data flow is maintained between different components of the application to ensure consistency and reliability.
The overall design of the application focuses on usability, clarity, and responsiveness. The interface is designed with simple layouts, clear buttons, and minimal input requirements to make it accessible to a wide range of users. The use of color indicators, structured navigation, and clear text enhances the user experience and reduces complexity.
In conclusion, the Grameen Light Energy application provides a practical and scalable solution for addressing real-world problems related to energy wastage and infrastructure maintenance. By combining reporting, tracking, and monitoring functionalities into a single platform, the system improves accountability, enhances efficiency, and promotes community participation. The project demonstrates how mobile technology can be effectively used to solve local problems and contribute to sustainable development.
 
4.3	System Implementation Home Screen
This screen represents the main interface of the application, providing centralized access to all
core functionalities. It includes options such as reporting issues, viewing streetlight status, tracking complaints, and accessing the system dashboard. The layout is designed to be simple and user-friendly, allowing users to navigate easily without technical difficulty.




<img width="576" height="1280" alt="WhatsApp Image 2026-05-15 at 9 27 24 PM" src="https://github.com/user-attachments/assets/7e675d26-0def-4056-9b0c-2864de7038b5" />








Figure 4.2: Home Screen

Issue Reporting Screen
This screen enables users to report streetlight issues by entering the corresponding Pole ID. The reporting process is designed to be quick and straightforward, requiring minimal input from the user. Once submitted, the complaint is recorded in the system and assigned for further processing.


 
<img width="720" height="1600" alt="WhatsApp Image 2026-05-15 at 9 41 18 PM" src="https://github.com/user-attachments/assets/022ee946-11c4-49b4-8427-78ccc636a02d" />


Figure 4.3: Issue Reporting Screen

Complaint Tracking Screen
This screen allows users to track the progress of their submitted complaints by entering a unique Complaint ID. The system displays relevant details such as the associated Pole ID and current status of the issue (e.g., in progress or resolved), ensuring transparency and user awareness.


<img width="576" height="1280" alt="WhatsApp Image 2026-05-15 at 9 27 25 PM" src="https://github.com/user-attachments/assets/1fa2fb0f-c94f-4c31-9c0d-e9222a3d74ca" />

Figure 4.4: Complaint Tracking Screen

Streetlight Status List
This screen displays a list of streetlights along with their operational status. Each streetlight is represented using color-coded indicators, where green denotes a working condition and red indicates a faulty or under-repair state. This visual representation helps users quickly identify problem areas.



<img width="576" height="1280" alt="WhatsApp Image 2026-05-15 at 9 27 24 PM (1)" src="https://github.com/user-attachments/assets/f31c45ca-ef27-420d-ab5f-9a15223daea6" />

Figure 4.5: Streetlight Status List



 
System Dashboard
This screen provides an overview of system activity, including the total number of active complaints and detailed issue logs. It helps in monitoring overall performance and identifying frequently reported problems. The dashboard presents summarized information in a clear and organized manner.



<img width="576" height="1280" alt="WhatsApp Image 2026-05-15 at 9 27 25 PM (1)" src="https://github.com/user-attachments/assets/3416e198-4b5a-4b59-8768-62219bb76d4c" />

Figure 4.6: System Dashboard


Admin Control Panel
This screen is designed for administrative use, allowing authorized users to update the status of reported issues and mark them as resolved. It also includes options to manage or reset system data. This ensures proper maintenance and control of the system.

<img width="576" height="1280" alt="WhatsApp Image 2026-05-15 at 9 27 26 PM (2)" src="https://github.com/user-attachments/assets/b7e27842-6a11-47f8-a68d-60e6711ae155" />


Figure 4.7: Admin Control Panel
 

 
4.4	Key Features
•	Streetlight Issue Reporting
Users can report streetlight problems by entering the Pole ID through a simple and quick interface.
•	Streetlight Status Monitoring
Displays a list of streetlights with their current condition using color indicators (working or faulty).
•	Complaint Tracking System
Allows users to track complaints using a unique Complaint ID and view the current status.
•	System Dashboard
Provides an overview of active complaints and system activity for better monitoring.
•	Admin Control Panel
Enables updating of complaint status and management of system data.
•	User-Friendly Interface
Designed with simple navigation and clear layout, making it easy for all users.

4.5	Individual Contribution
During the development of the Grameen Light Energy project, I was actively involved in all major stages of the application. I contributed to understanding the problem statement and designing the workflow of the system.
The application was developed using Kotlin and Android Studio, where I implemented key features such as issue reporting, complaint tracking, and streetlight status display. I also designed the user interface to ensure simplicity and usability.
Additionally, I worked on data handling and ensured proper functionality of the application through testing and debugging. The overall performance was improved, and smooth navigation between different modules was maintained.
Overall, I contributed to the planning, d
