import com.example.demo.Id
import com.example.demo.IdConverter
import com.example.demo.User
import jakarta.persistence.*
import jakarta.persistence.Id as JpaId

@Entity
@Table(name = "course")
class Course(
    id: Id<Course>,
    title: String,
    instructorId: Id<User>,
    subInstructorId: Id<User>? = null,
) {
    @JpaId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Id<Course> = id
        protected set

    @Column(name = "instructor_id")
    var instructorId: Id<User> = instructorId
        protected set

    @Column(name = "sub_instructor_id")
    @Convert(converter = IdConverter::class)
    var subInstructorId: Id<User>? = subInstructorId
        protected set


    @Column(name = "title")
    var title: String = title
}
