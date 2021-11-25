#include <iostream>

#define BUFFER_SIZE (size_t)20E9

template <typename T, size_t SIZE>
inline size_t get_size(T (&)[SIZE]) {
    return SIZE;
}

int main(int argc, char const* argv[]) {
    std::cout << BUFFER_SIZE << std::endl;
    return 0;
}