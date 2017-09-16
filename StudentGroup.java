import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException("IllegalArgumentException");
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
		{
			throw new IllegalArgumentException("IllegalArgumentException");
		}
		else
			return students[index];
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null)
					throw new IllegalArgumentException("IllegalArgumentException");
				if(index<0 || index>=students.length)
								throw new IllegalArgumentException("IllegalArgumentException");
							students[i]=student;
	
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
					throw new IllegalArgumentException("IllegalArgumentException");
		student temp=new student();
		for(int i=0;i<=students.length;i++)
		{
			temp=students[i];
			students[i]=student;
			i++;
			student=students[i];
			students[i]=temp;
		}
		students.length=students.length+1;
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
					throw new IllegalArgumentException("IllegalArgumentException");
		int i;
		i=students.length;       
        students[i]=student;
        students.length=students.length+1;		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null)
					throw new IllegalArgumentException("IllegalArgumentException");
	    if(index<0 || index>=students.length)
								throw new IllegalArgumentException("IllegalArgumentException");
		student temp=new student();
		for(int i=index;i<=students.length;i++)
		{
			temp=students[i];
			students[i]=student;
			i++;
			student=students[i];
			students[i]=temp;
		}
	    students.length=students.length+1;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
								throw new IllegalArgumentException("IllegalArgumentException");
		for(int i=index;i<students.length;i++)
		{
			students[i]=students[i+1];
		}
		students.length=students.length-1;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student==null)
					throw new IllegalArgumentException("IllegalArgumentException");
		int i;
		for(i=0;i<students.length;i++)
		{
			if(students[i]==student)
				break;
		}
		int index=i;
		for(int i=index;i<students.length;i++)
		{
			students[i]=students[i+1];
		}
		students.length=students.length-1;
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
								throw new IllegalArgumentException("IllegalArgumentException");
		students.length=index;
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student==null)
					throw new IllegalArgumentException("IllegalArgumentException");
		int i;
		for(i=0;i<students.length;i++)
		{
			if(students[i]==student)
				break;
		}
		int index=i;
		students.length=index;
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
								throw new IllegalArgumentException("IllegalArgumentException");
		for(i=0;index<students.length;index++,i++)
		{
			students[i]=students[index];
		}
		students.length=i;
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student==null)
					throw new IllegalArgumentException("IllegalArgumentException");
		int i;
		for(i=0;i<students.length;i++)
		{
			if(students[i]==student)
				break;
		}
		int index=i;
		for(i=0;index<students.length;index++,i++)
		{
			students[i]=students[index];
		}
		students.length=i;
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		l=students.length;
		student[] sample=new student[l];
		int j=0;
		for(int i=0;i<student.length;i++)
		{
			if(students[i].birthdate==date)
			{
				sample[j]=students[i];
				j++;
			}
		}
		return sample;
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		student[] sample=new student[];
		int i,j=0;
		int max=student[0].avgMark; 
		for(i=0;i<students.length;i++)
		{
		if(student[i].avgMark>max)
			max=student[i].avgMark;
		}
		for(i=0;i<students.length;i++)
		{
			if(students[i].avgMark == max)
			{
				sample[j]=students[i];
				j++;
			}
		}
		return sample;
		
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student==null)
					throw new IllegalArgumentException("IllegalArgumentException");
		int i;
		for(i=0;i<students.length;i++)
		{
			if(students[i]==student)
				break;
		}
		return students[i+1];
		return null;
	}
}
