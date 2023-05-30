public class TaskList {
    Task []tasks;
    int size;
    public TaskList(){
        tasks = new Task[10];
        size=0;
    }
    public void addTask(Task task){
        for(Task i:tasks){
            tasks[size]=task;
            size++;
        }
    }
    public void removeTask(int taskId){
        int x=0;
        for(int i=0;i<tasks.length-1;i++){
            if (tasks[i] != tasks[i+1]) {
                tasks[x]=tasks[i];

            }
        }
    }
    public Task getTask(int taskId){
        int input=taskId;
        if(input !=-1){
            return tasks[input];
        }
        return null;

    }
    public void markTaskAsCompleted(int taskId){

    }

}

