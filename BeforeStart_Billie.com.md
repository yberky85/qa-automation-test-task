In this assessment I prefer to use TestNG Framework and Rest Assured library with Maven Dependencies;
In case of project do not run in your local please do not hesitate to contact me at yberky85@hotmail.com

Under Billie.com Project there are two main sources for classes;
1- Under src/main/java _ billie.utilities package there are two classes;
    1.1- Billie_API_Initialize for using Test NG @Before Class annotation we define API Request and Some Response settings general
    1.2- Billie_Constants you can find main URI and path for API
    
2- Under src/test/java _ getRequest package there is one class;
    2.1- Billie_Comment_API_Control_Test for using Test NG @Test annotation we define methods for testing like size control and id specific value control
    
Also for running your test at the console, you could see and *.xml file as BillieAPIRegression.xml. For this assessment purpose, I wrote two test method in the same class. 
The main structure capable with for other tests, run under other classes, you generally create a class under src/test/java _getRequest (If itis a Post you could create the new package as postRequest).
And then with extends Billie_API_Initialize you just only write your test under this class.