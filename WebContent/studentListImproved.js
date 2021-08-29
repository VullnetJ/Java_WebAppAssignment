

function fn1 () {
  document.getElementById("resultStudents").innerHTML += "fn1 gets called";
}

function main() {
	fetch("localhost:8080/FullStackExercises_3/studentList") 
	.then(response => response.json()) 
	.then(studentList => printStudent(studentList));
}

function Students(studentList) {
	for (var student of studentList) { 
		console.log(student.name);
	} 
}
main();

