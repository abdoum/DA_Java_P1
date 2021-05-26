# Heme Biotech Analytics counter

## 1. Removed [unecessary variables](https://github.com/abdoum/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/blob/master/Project02Eclipse/src/com/hemebiotech/analytics/AnalyticsCounter.java#L17)

```java
int i = 0;
```

Removed [unecessary variables](https://github.com/abdoum/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/blob/master/Project02Eclipse/src/com/hemebiotech/analytics/AnalyticsCounter.java#L8)

```java
private static int headacheCount = 0; // initialize to 0
 private static int rashCount = 0;  // initialize to 0
 private static int pupilCount = 0;  // initialize to 0
```

## 2. Fixed broken file path [unecessary variables](https://github.com/abdoum/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/blob/master/Project02Eclipse/src/com/hemebiotech/analytics/AnalyticsCounter.java#L14)

replaced:

```java
BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
```

with:

```java
  BufferedReader reader = new BufferedReader(new FileReader("Project02Eclipse/symptoms.txt"));
```

## 3. [Added symptoms to an empty dictionary](https://github.com/abdoum/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/blob/master/Project02Eclipse/src/com/hemebiotech/analytics/AnalyticsCounter.java#L21)

...appending the count if it has already been added to the dictionary:

```java
if (symptoms.containsKey(line)) {

    symptoms.put(line, symptoms.get(line) + 1); // if symptom is already in dictionary, increment its count
               // by 1
   } else {

    symptoms.put(line, (long) 1); // else add symptom to dictionary and mark its count as 1

   }

```

## 4. Fixed [leak](https://github.com/abdoum/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/blob/master/Project02Eclipse/src/com/hemebiotech/analytics/AnalyticsCounter.java#L35) caused by an unclosed reader

```java
reader.close();
```

## 5. [Iterate throught](https://github.com/abdoum/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/blob/master/Project02Eclipse/src/com/hemebiotech/analytics/AnalyticsCounter.java#L38) dictionary and write results to file

```java
for (Object symptom : symptoms.entrySet()) {

   writer.write(symptom.toString() + "\n");

  }

```
