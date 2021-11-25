class Main:
    def __init__(self, name: str):
        self._name: str = name

    def getName(self) -> str:
        return self._name
    
if __name__ == "__main__":
    test = Main("Python")
    print(test.getName())