#midterm_grade_cosc
#Authors: Tanner Klock
#Date: November 3rd, 2023

#description: This program will allow the user to calculate their midterm grade from COSC 1100

from calendar import c


FIRST_TWO_PRE_CLASSES_MARKS = 10
MAX_PRE_CLASS_MARKS = 3
MAX_CLASS_EXERCISE_MARKS = 3
MAX_TESTS_MARKS = 25
PRE_CLASS_WEIGHT = 0.03
CLASS_EXERCISE_WEIGHT = 0.03
TEST_WEIGHT = 0.06

is_valid = False
pre_class_activity_marks = list()
class_exercise_marks = list()
test_marks = list()

#input:
pre_classes_completed = int(input("Enter the amount of pre class activities completed: "))
class_exercises_completed = int(input("Enter the amount of class exercises completed: "))
tests_completed = int(input("Enter the amount of Tests you've completed: "))

#Get pre class activity marks
count = 0
for count in range(0, pre_classes_completed, 1):
    pre_class_activity_marks.append(float(input("Please enter your mark for pre-class activity " + str(count+1) + ": ")))

#Get the class exercise marks
count = 0
for count in range(0, class_exercises_completed, 1):
    class_exercise_marks.append(float(input("please enter your mark for class exercise " + str(count+1)+ ": ")))
#Get test marks
count = 0
for count in range(0, tests_completed, 1):
    test_marks.append(float(input("Please enter your mark for Test " + str(count+1)+ ": ")))

#process:
#Change the first 2 pre classes into percents with their different max mark and weight them.
pre_class_activity_marks[0] = pre_class_activity_marks[0]/FIRST_TWO_PRE_CLASSES_MARKS
pre_class_activity_marks[1] = pre_class_activity_marks[1]/FIRST_TWO_PRE_CLASSES_MARKS

#Convert the rest of the lists into percents
count = 2
for count in range(2, pre_classes_completed, 1):
    pre_class_activity_marks[count] = pre_class_activity_marks[count]/MAX_PRE_CLASS_MARKS

for count in range(0, class_exercises_completed, 1):
    class_exercise_marks[count] = class_exercise_marks[count]/MAX_CLASS_EXERCISE_MARKS

for count in range(0, tests_completed, 1):
    test_marks[count] = test_marks[count]/MAX_TESTS_MARKS

#get the average for each assement type
pre_class_sum_percent = sum(pre_class_activity_marks)/pre_classes_completed
class_exercise_sum_percent = sum(class_exercise_marks)/class_exercises_completed
test_sum_percent = sum(test_marks)/tests_completed

#Calculate the weights of every assessment
pre_class_weight_total = sum(pre_class_activity_marks)*PRE_CLASS_WEIGHT
class_exercise_weight_total = sum(class_exercise_marks)*CLASS_EXERCISE_WEIGHT
test_weight_total = sum(test_marks)*TEST_WEIGHT

total_possible_weight = PRE_CLASS_WEIGHT*pre_classes_completed + CLASS_EXERCISE_WEIGHT*class_exercises_completed + TEST_WEIGHT*tests_completed
total_weight = pre_class_weight_total + class_exercise_weight_total + test_weight_total
overall_grade = total_weight/total_possible_weight
#output:

print("Grade for pre-class activities: " + str(round(pre_class_sum_percent*100)))
print("Grade for Class Exercises: " + str(round(class_exercise_sum_percent*100)))
print("Grade for tests: " + str(round(test_sum_percent*100)))
print("Overall grade: " + str(round(overall_grade*100)))

input("\nPress 'Enter' to exit program.")