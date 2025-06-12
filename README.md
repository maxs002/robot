# robot
# finch-robot

### Development Checklist

| Completed | Task         | Description |
|:---------:| :-----------:|:------------|
|    ✅     | Familiarize  | Learn how to: <ul><li>Connect to the robot</li><li>Interpret what built-in sensors detect</li><li>Program basics in SNAP!</li><li>Setup local developing environment to code in Java</li></ul>|
|    ✅     | 3D Design    |             |
|    ✅     | Develop Code |             |

---

<details>
<summary><strong>Inspiration for the Project</strong></summary>

Wanted to test around with the LED, compass, and shake.
</details>

---

### Design Cycle
<img src="design_cycle.png" alt="design cycle" width="300" height="300">

###### Include commentary on your experience with the design cycle during this project

---

### Code to Highlight
```java
        if (userInput < 1 || userInput > 25) {
            System.out.println("Invalid input. Please enter a number from 1 to 25.");
            return;
        }
        setDisplay(led, userInput, 1);
        bird.setDisplay(led);
        while (!bird.isShaking()) {
            System.out.println("Compass Heading: " + bird.getCompass());
            bird.setMove("F", 999, 50);
            bird.pause(10);
        }
        
        bird.setDisplay(new int[25]);
    }
```

---

### Choose At Least Three of the Following to Include:
- What was your motivation?
- Why did you build this project? (Note: the answer is not "Because it was a homework assignment.")
- What problem does it solve?
- What did you learn?
- What makes your project stand out?
