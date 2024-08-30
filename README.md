# Seller Feedback System 
A web application that allows users to view a list of sellers, add feedback, and perform various actions related to seller management. The system is built using Spring Boot for the backend and React for the frontend.

# Project Structure
    1. Backend: Built with Spring Boot.
    2. Frontend: Built with React and Bootstrap.
    

## Setup Instructions

### Backend (Spring Boot)

1. Prerequisites:
      - Java Development Kit (JDK 17 or higher)
      - Gradle
        
2. Clone the Repository using below command
   > git clone https://github.com/Hiral-Sanghani/Seller-Feedback-System.git
   >
   > cd Seller-Feedback-System

3. Build and Run the Application:
    > gradlew bootrun

* The application will start and be available at http://localhost:8080.
  
### Frontend (React)

1. Navigate to Frontend Directory:
    > cd Seller-Feedback-System\src\main\webapp

2. Install Dependencies:
    > npm install

3. Run the Application:
    > npm start

* The application will start and be available at http://localhost:3000.

### API endpoints 

**Authentication**
  1. Login
     - **Endpoint**: /api/login
     - **Method**: POST
     - **Request Body**:
          >{
          >
          >  "userName" : "admin",
          >
          >  "password" : "admin"
          >
          >}
     - **Response**:
          > ResponseStatus: 200:OK
          >
          > ResponseText:  Login Successful
          
  2. Sellers
       - **Endpoint**: /api/feedback
       - **Method**: GET
       - **Description**: It will display list of all the sellers.
         
  3. Get Seller by name
       - **Endpoint**: /api/feedback/{sellerName}
       - **Method**: GET
       - **Description**: It will fetch feedback by seller name.
         
  4. Create Feedback
       - **Endpoint**: /api/feedback
       - **Method:** POST
       - **Request Body**:
           >{
           >
           > "sellerName" : "INDIA Ltd",
           >
           > "rating" : 1,
           >
           > "review" : "comments"
           >
           > }

