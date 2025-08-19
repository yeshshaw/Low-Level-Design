🤖 Robot Behavior System – Strategy Design Pattern

This project demonstrates the Strategy Design Pattern in Java using a Robot system.
Instead of hardcoding behaviors (like walk, talk, fly) into the Robot class, we delegate the behavior to separate strategy interfaces.
This makes the system flexible, reusable, and easy to extend.

⸻

📌 Features
	•	Flexible Behavior Assignment → A robot can walk, talk, or fly depending on the strategies passed.
	•	Loose Coupling → Behavior is not hardcoded inside the robot; it’s injected at runtime.
	•	Reusability → You can mix-and-match behaviors across different robot types.
	•	Extensibility → Add new behaviors without modifying existing robot classes.

⸻

🛠️ Design Pattern Used
	•	Strategy Pattern → Encapsulates algorithms (walk, talk, fly) inside separate classes and makes them interchangeable.
	•	Composition over Inheritance → Robot “has-a” behavior instead of “is-a” fixed behavior.
 ✅ Advantages of Strategy Pattern
	•	Promotes Open/Closed Principle (open for extension, closed for modification).
	•	Encourages composition over inheritance.
	•	Helps create highly flexible and scalable systems.

⸻

📖 Learnings

This project is a practical example of applying the Strategy Design Pattern in Java.
It shows how robots can change their behavior dynamically at runtime by swapping strategies.
