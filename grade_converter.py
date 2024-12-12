# grade_converter
# Author: Tanner Klock
# Created: December 8th,2023

# Description: This function will allow the user to input a numeric grade and convert it to a letter grade according to Durham Colleges /
# official Academic Grading Policy.

def numeric_to_letter(grade):
    letter_grades = ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C', 'D+', 'D', 'F']
    numeric_grade_range = [100, 90, 85, 80, 75, 70, 65, 60, 55, 50]
    try:
        numeric_grade = float(grade)
        if(numeric_grade <= numeric_grade_range[0] and numeric_grade >= numeric_grade_range[1]):
            return letter_grades[0]
        elif(numeric_grade < numeric_grade_range[1] and numeric_grade >= numeric_grade_range[2]):
            return letter_grades[1]
        elif(numeric_grade < numeric_grade_range[2] and numeric_grade >= numeric_grade_range[3]):
            return letter_grades[2]
        elif(numeric_grade < numeric_grade_range[3] and numeric_grade >= numeric_grade_range[4]):
            return letter_grades[3]
        elif(numeric_grade < numeric_grade_range[4] and numeric_grade >= numeric_grade_range[5]):
            return letter_grades[4]
        elif(numeric_grade < numeric_grade_range[5] and numeric_grade >= numeric_grade_range[6]):
            return letter_grades[5]
        elif(numeric_grade < numeric_grade_range[6] and numeric_grade >= numeric_grade_range[7]):
            return letter_grades[6]
        elif(numeric_grade < numeric_grade_range[7] and numeric_grade >= numeric_grade_range[8]):
            return letter_grades[7]
        elif(numeric_grade < numeric_grade_range[8] and numeric_grade >= numeric_grade_range[9]):
            return letter_grades[8]
        elif(numeric_grade < numeric_grade_range[9]):
            return letter_grades[9]
    except:
        return "Error"
    
print(numeric_to_letter('hello'))
