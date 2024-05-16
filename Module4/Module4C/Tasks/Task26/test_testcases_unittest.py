
import unittest

import testcases


class TestTestcases(unittest.TestCase):

    def test_compare_two_strings(self):
        self.assertEqual(testcases.compare_two_strings("hello", "hello"), True)

    def test_compare_different_numbers(self):
        self.assertEqual(testcases.compare_different_numbers(25, 67), True)


if __name__ == '__main__':
    unittest.main()
