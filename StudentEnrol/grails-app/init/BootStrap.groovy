import com.studentenrol.*
class BootStrap {

    def init = { servletContext ->

	def course1=new Course(title:'Interactive Media with Animation',
				department:'Computing',
				description:'''Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum''',
				leader:'Professor Reece Cope',
				code:'IMMA101',
				startDate:new Date('19/01/2016'),
				endDate:new Date('19/01/2018')).save()

	def student1=new Student(name: 'Reece Cope',
				studentid: '12',
				dob: '25,08,1996',
				email: 'b4024790@shu.ac.uk',
				username: 'b4024790',
				password: 'password',
				course: 'Web Systems Design').save()

def student2=new Student(name: 'Connor Woolley',
				studentid: '13',
				dob: '12,06,1996',
				email: 'b4025519shu@.ac.uk',
				username: 'b4025519',
				password: 'password',
				course: 'Web Systems Design').save()
    }
    def destroy = {
    }
}
