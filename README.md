# javaPractice

This is a minimal Maven Java project skeleton created by the assistant.

Build and run (Windows PowerShell):

```powershell
# show mvn version
mvn -v

# run tests
mvn test

# run the app (requires the exec plugin; alternative: java -cp target\javaPractice-0.1.0-SNAPSHOT.jar com.example.App)
mvn -q exec:java -Dexec.mainClass="com.example.App"
```

Notes:
- Java 17 is configured in `pom.xml`.
- Uses JUnit Jupiter for testing.

Files added by assistant:
- `pom.xml` - Maven project file (Java 17, JUnit Jupiter)
- `src/main/java/com/example/App.java` - sample main and helper method
- `src/test/java/com/example/AppTest.java` - basic JUnit test for `add`

If you'd like, I can run `mvn -v` and `mvn test` here to verify the environment — tell me if you want me to run those commands now.
