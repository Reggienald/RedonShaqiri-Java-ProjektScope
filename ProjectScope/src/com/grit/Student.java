package com.grit;

    // State
    public class Student {
        private RecordBook recordBook;
        private String name;
        private int age;

        // Constructor Student //
        public Student(RecordBook recordBook, String name, int age) {
            this.recordBook = recordBook;
            this.name = name;
            this.age = age;
        }
        // Behaviour
        public String toString() {
            return("Name : " + getName()
                    + ". Age : " + getAge()
                    + ". Grade : " + getRecordBook().getGrade());

        }

        //Getters for student.
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
        public RecordBook getRecordBook() {
            return recordBook;
        }
    }
