import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;



        public class LambdaRunnerTest {
            private Human human =
                    new Human("FirstName", "MiddleName", "LastName", 20, Gender.male);
            private Human human1 =
                    new Human("FirstName", "MiddleName", "LastName", 22, Gender.male);
            private Student student = new Student(
                    "FirstName",
                    "MiddleName",
                    "LastName",
                    20,
                    Gender.female,
                    "University",
                    "Faculty",
                    "Specialty");
            private String str = "STRING,STRING STRING";

            @Test
            public void processHuman() {
                Assert.assertEquals(21, (int)LambdaRunner.function(LambdaDemo.incrementAge, human).getAge());
            }

            @Test
            public void humanGetAge() {
                Assert.assertEquals(20, (int)LambdaRunner.function(LambdaDemo.getAge, student));
            }

            @Test
            public void getFullName() {
                Assert.assertEquals(
                        "FirstName MiddleName LastName", LambdaRunner.function(LambdaDemo.getFullName, human));
            }

            @Test
            public void isContainSpaces() {
                Assert.assertTrue(LambdaRunner.function(LambdaDemo.isContainSpaces, str));
            }

            @Test
            public void getFirstChar() {
                Assert.assertEquals('S', (char)LambdaRunner.function(LambdaDemo.getFirstChar, str));
            }

            @Test
            public void getStringLength() {
                Assert.assertEquals(20, (int)LambdaRunner.function(LambdaDemo.getStringLength, str));
            }
            @Test
            public void getWordCount() {
                Assert.assertEquals(2, (int)LambdaRunner.function(LambdaDemo.getWordCount, str));
            }

            @Test
            public void isSameLastName() {
                Assert.assertTrue(LambdaRunner.twoHumansToBool(LambdaDemo.isSameLastName, human, student));
            }
            @Test
            public void areAllYoungerThan() {
                Assert.assertTrue(
                        LambdaRunner.threeHumansAndIntToBool(LambdaDemo.areAllYoungerThan, human, human1, student,25));
            }
        }
